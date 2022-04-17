angular.module('crm-front').controller('orderController', function ($scope, $http) {
    const contextPath = 'http://localhost:5555/core/';

    $scope.loadOrders = function () {
        $http ({
                url: contextPath + 'api/v1/orders/',
                method: 'GET'
            }).then(function (response) {
                $scope.orders = response.data;
            });
        };
});