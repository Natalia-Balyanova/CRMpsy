angular.module('crm-front').controller('birthdayController', function ($scope, $http) {
    const contextPath = 'http://localhost:8190/crm/';

    $scope.loadClients = function () {
            $http ({
                url: contextPath + 'api/v1/clients/birthday',
                method: 'GET',
            }).then(function (response) {
                $scope.clients = response.data;
            });
        };

    $scope.createLetter = function (address,phone) {
        $http ({
            url: contextPath + 'api/v1/letters/' + address + '/'+ phone + '/BIRTH',
            method: 'GET',
        }).then(function (response) {
            $scope.letter = response.data;
        });
    };

    $scope.sendLetter = function () {
        $http ({
            url: contextPath + 'api/v1/letters/send',
            method: 'POST',
            data: $scope.letter
        }).then(function (response) {
            alert('Success!');
        });
    };

    $scope.loadClients();
});