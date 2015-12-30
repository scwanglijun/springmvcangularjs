/**
 * Created by wanglijun on 15/12/26.
 */
var app=angular.module('app',[]);
app.config(function($httpProvider){});
app.controller('AppCtrl',function($scope,$http){
    $scope.user={id:'',username:''};

    $scope.roles=[];
    $scope.rights=[];

    $scope.selectrole="";

    $scope.rolerights=[];

    function init(){
        $http.get('role/list.json').success(function(data){
            $scope.roles=data;
        });

        $http.get('role/rights.json').success(function(data){
            $scope.rights=data;
        });
    }

    init();

    function loadright(){
        if($scope.selectrole==''){
            console.log('数据为空!');
            return;
        }
        $http.post('role/rolerights.json',{id:$scope.selectrole}).success(function(data){
            $scope.rolerights=data;
            for(var i=0;i<$scope.rights.length;i++){
                $scope.rights[i].checked=false;
                angular.forEach(data,function(value,key){
                      if(value.id==$scope.rights[i].id){
                          console.log('-----------')
                           $scope.rights[i].checked=true;
                      }
                });
            }
        });
    }

    $scope.$watch('selectrole',function(){
        loadright();
    });

    $scope.adduser=function(){
        if($scope.username===''){
            console.log('用户名不能为空!');
            return;
        }
        console.log($scope.user);
        $http.post('user/add.json',{id:$scope.user.id,username:$scope.user.username}).success(function(data){
            console.log(data);
            if(data.id) {
                alert('添加成功!');
                $scope.user = data;
            }
        }).error(function(data,status,headers,config){
            console.log(data);
            console.log(status);
            console.log(headers);
        });
    }
});