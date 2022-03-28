angular.module('crm-front').controller('psychologiesController', function ($scope, $http, $location, $localStorage) {
    const contextPath = 'http://localhost:8190/crm/';

    $scope.loadCustomers = function (product_id) {
        $http ({
            url: contextPath + 'api/v1/clients/' + psychologies_id,
            method: 'GET'
        }).then(function (response) {
            $scope.clients = response.data;
        });
    };

    $scope.createBonusLetter = function (address,phone) {
        $http ({
            url: contextPath + 'api/v1/letters/' + address + '/'+ phone + '/BONUS',
            method: 'GET',
        }).then(function (response) {
            $scope.bonusLetter = response.data;
        });
    };

    $scope.sendBonusLetter = function () {
        $http ({
            url: contextPath + 'api/v1/letters/send',
            method: 'POST',
            data: $scope.bonusLetter
        }).then(function (response) {
            alert('Success!');
        });
    };

});