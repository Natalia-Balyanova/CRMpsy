angular.module('crm-front').controller('bonusController', function ($scope, $http, $location, $localStorage) {
    const contextPath = 'http://localhost:5555/core/';

    $scope.loadClients = function (psychologies_id) {
        $http ({
            url: contextPath + 'api/v1/clients/' + psychologies_id,
            method: 'GET'
        }).then(function (response) {
            $scope.clients = response.data;
            $scope.current_psychologies_id = psychologies_id;
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

     $scope.makePsyReport = function () {
        $http ({
            url: contextPath + 'api/v1/clients/report/'+ $scope.name +'/BONUS/' + $scope.current_psychologies_id,
            method: 'POST',
            data: $scope.clients
        }).then(function (response) {
            alert('Report Created');
        });
     };

});