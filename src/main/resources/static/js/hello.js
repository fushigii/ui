angular.module('hello', [])
  .controller('home', function($scope, $http) {
	  $http.get('/api/resource').success(function(data){
		  $scope.greeting = data;
	  })
  });