(function() {
	
	"use strict";
	
	angular
		.module("ngNatureJardim", ['ngMaterial'])
		.controller("customerCtrl", function($scope, $http, $mdSidenav, $timeout) {
			
			
			$http.get('customer/list')
			       .then(function(res){
			          $scope.customers = res.data;                
			        });
			
			
		    $scope.toggleLeft = buildToggler('left');

		    function buildToggler(componentId) {
		      return function() {
		        $mdSidenav(componentId).toggle();
		      };
		    }
		    //Save a new customer by post
		    $scope.saveCustomer = function(customer) {
		    	
		    	if(typeof customer != 'undefined' && customer) {
		    		var sendJson = $http.post("/customer/add", $scope.customer);
		    		$scope.customers.push(customer);
		    		$scope.customer = {};
		    		$scope.toggleLeft();
		    	} else {
		    		$scope.toggleLeft();
    		
		    	}
		    }
		    
		    
		});
})();
