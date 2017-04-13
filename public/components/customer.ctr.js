(function() {
	
	"use strict";
	
	angular
		.module("ngNatureJardim")
		.controller("customerCtrl", function($scope, $http) {
			$http.get('customer/list')
		       .then(function(res){
		          $scope.customers = res.data;                
		        });
			
			$scope.name = "Daniel";
			$scope.message = "Welcome to Nature Jardim"


		});
})();
