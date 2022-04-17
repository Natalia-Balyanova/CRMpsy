angular.module('crm-front').controller('birthdayController', function ($scope, $http) {
    const contextPath = 'http://localhost:5555/core/';

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

    $scope.makeReport = function () {
        $http ({
             url: contextPath + 'api/v1/clients/report/' + $scope.name + '/BIRTH/0',
             method: 'POST',
             data: $scope.clients
        }).then(function (response) {
             alert('Report created');
        });
    };

    $scope.loadClients();
});