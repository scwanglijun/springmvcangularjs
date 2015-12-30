/**
 * Created by wanglijun on 15/12/26.
 */
var app=angular.module('app',[]);
app.config(function($httpProvider){});
app.controller('AppCtrl',function($scope,$http){
    $scope.user={id:'',username:''};
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