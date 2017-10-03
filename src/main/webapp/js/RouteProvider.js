'use strict';


// Declare app level module which depends on filters, and services
var app=angular.module('adminMarketplace', [
  'ngRoute',
  'angularUtils.directives.dirPagination',
  'adminMarketplace.controllers'
]);
app.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {templateUrl: 'partials/menu.html'});
	$routeProvider.when('/Proveedor', {templateUrl: 'partials/Proveedor.html', controller: 'ProveedorCtrl'});
	$routeProvider.when('/Catalogo', {templateUrl: 'partials/Catalogo.html', controller: 'CatalogoCtrl'});
	
  	$routeProvider.otherwise({redirectTo: '/'}); 
}]);

var module=angular.module("adminMarketplace.controllers",[]);
