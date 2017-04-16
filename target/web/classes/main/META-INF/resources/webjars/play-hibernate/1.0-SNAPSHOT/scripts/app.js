angular
	.module("ngNatureJardim", ["ngMaterial"])
	.config(function($mdThemingProvider){
	
		$mdThemingProvider.theme('default')
			.primaryPalette('green')
			.accentPalette('orange')
	})
	.directive("helloWorld", function() {
		return {
			template: "<h1>{{ message }}</h1>"
		}
	});


