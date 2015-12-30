/**
 * Created by wanglijun on 15/12/26.
 */
var app=angular.module('app',[]);
app.config(function($httpProvider){});
app.value('realname','Even');
app.constant('http','www.baidu.com');
app.factory('Data',function(){
    var service= {
        msg:'Hello world',
        setMsg:function(){
            this.msg='Hello';
        }
    }
    return service;
});
app.service('User',function(){
     this.firstname='wang';
     this.lastname='lijun';
     this.getName=function(){
         return this.firstname+this.lastname;
     }
});
app.controller('AppCtrl',function($scope,$http,realname,http,Data,User){
    $scope.msg="hello world!";
    $scope.realname=realname;
    $scope.http=http;
    $scope.data=Data;
    Data.setMsg();
    //data.setMsg();
    $scope.username=User.getName();

});