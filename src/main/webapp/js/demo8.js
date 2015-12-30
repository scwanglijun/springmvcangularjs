/**
 * Created by wanglijun on 15/12/26.
 */
var app=angular.module('app',[]);
app.config(function($httpProvider){});
app.controller('AppCtrl',function($scope,$http){
    console.log($http);

    $http.get('user/get.json?id=2',{param:{id:'5'}}).success(function(data){
        console.log(data);
        $scope.user=data;
    }).error(function(data,status,headers,config){
        console.log(data);
        console.log(status);
        console.log(headers);
    });
});