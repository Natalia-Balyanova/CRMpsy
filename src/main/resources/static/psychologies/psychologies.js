angular.module('crm-front').controller('psychologiesController', function ($scope, $http, $location, $localStorage) {
    const contextPath = 'http://localhost:8190/crm/';

//    $scope.loadPsy = function (pageIndex = 1) {
//        $http({
//            url: contextPath + 'api/v1/psychologies',
//            method: 'GET',
//            params: {
//                p: pageIndex,
//                problem_part: $scope.filter ? $scope.filter.problem_part : null,
//                method_part: $scope.filter ? $scope.filter.method_part : null,
//                birthday_part: $scope.filter ? $scope.filter.birthday_part : null,
//            }
//        }).then(function (response) {
//            $scope.PsyPage = response.data;
//        });
//    };

        $scope.loadPsy = function () {
            $http({
                url: contextPath + 'api/v1/psychologies',
                method: 'GET',
            }).then(function (response) {
                $scope.PsyPage = response.data;
            });
        };

      $scope.loadPsyDefault = function (pageIndex = 1) {
             $http.get(contextPath + 'api/v1/psychologies')
                 .then(function (response) {
                     $scope.PsyPage = response.data;
                 });
      }

    $scope.loadPsy();
});