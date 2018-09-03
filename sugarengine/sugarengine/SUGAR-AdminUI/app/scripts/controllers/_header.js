// Generated by CoffeeScript 1.10.0
'use strict';

/**
 * @ngdoc function
 * @name sgaAdminApp.controller:HeaderCtrl
 * @description
 * # HeaderCtrl
 * Controller of the sgaAdminApp
 */
angular.module('sgaAdminApp').controller('HeaderCtrl', ['$scope', '$location', 'permissionService', 'ipCookie', 'config', 'Auth', function($scope, $location, permissionService, ipCookie, config, Auth) {

	$scope.hasGetUserListPermission = false;
	$scope.hasGetGroupListPermission = false;
	$scope.hasGetGameListPermission = false;
	$scope.hasGetRoleListPermission = false;
	$scope.hasGetSourcesListPermission = false;

	$scope.loggedIn = Auth.isAuthenticated;
	$scope.Logout = function() {
		Auth.set(config.tokens.authorization, null);
		Auth.preApproved = false;
		ipCookie.remove("userId");
		$scope.resetNavbar();

		var returnPath;
		returnPath = $location.search()["return"];
		if (returnPath != null) {
			$location.search('return', null);
			return $location.path(returnPath);
		} else {
			return $location.path('/login');
		}
	};

	$scope.$on('updateNavbar', function () {
      $scope.updateNavbar();
	});

	// our permissions
	$scope.updateNavbar = function() {
		$scope.hasGetUserListPermission = permissionService.hasAccessToClaim('Get-User', -1);
		$scope.hasGetGroupListPermission = true; //permissionService.hasAccessToClaim('Get-Group',-1);
		$scope.hasGetGameListPermission = true; //permissionService.hasAccessToClaim('Get-Game',-1);
		$scope.hasGetRoleListPermission = permissionService.hasAccessToClaim('Get-Role',-1);
		$scope.hasGetSourcesListPermission = permissionService.hasAccessToClaim('Get-AccountSource',-1);
	}

	$scope.resetNavbar = function() {
		$scope.hasGetUserListPermission = false;
		$scope.hasGetGroupListPermission = false;
		$scope.hasGetGameListPermission = false;
		$scope.hasGetRoleListPermission = false;
		$scope.hasGetSourcesListPermission = false;
	}

}]);
