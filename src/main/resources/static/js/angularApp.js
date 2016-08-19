var app = angular.module("App",[]);

app.controller("MainController", function($scope, $http){


    //==========================================================
    //Global variables==========================================
    //==========================================================
    $scope.state = null;


    //==========================================================
    //End of global variables===================================
    //==========================================================






    //==========================================================
    //Objtains all the data from the device table===============
    //==========================================================
    $http.get("rest/api/device")
        .then(function(resp){
        $scope.devices = resp.data;
    });
    //==========================================================
    //end of Device Get()=======================================
    //==========================================================






    //==========================================================
    //obtains all the state objects from the database===========
    //==========================================================
    $http.get("/rest/api/state")
        .then(function(resp){
        $scope.states = resp.data;

        for(var i = 0; i < $scope.states.length; i++){
            styleChanger($scope.states[i]);
        }
    });
    //==========================================================
    //end of State Get()========================================
    //==========================================================






    //==========================================================
    //This functions goes through the status object looking fot=
    //and id sended by some button, when it is found ===========
    //styleChanger(data) is called to modify the view ==========
    //==========================================================
    $scope.sendInstruction = function(event){

        elementId = event.currentTarget.getAttribute("id").split("-")[1];

        for(var i = 0 ; i < $scope.states.length; i++){

            if($scope.states[i].deviceId == elementId){
                $scope.states[i].status = !$scope.states[i].status;

                    $http.post("/rest/api/state",$scope.states[i])
                        .then(function(resp){
                        console.log(resp);
                    });

                styleChanger($scope.states[i]);

                break;
            }

        }
    };
    //==========================================================
    //Eng sendInstruction=======================================
    //==========================================================







    //==========================================================
    //this function changes the style of the devices in the html
    //==========================================================
    var styleChanger = function(data){
         if(data.status == true)
             $("#device-"+data.deviceId).attr("style","background-color:#8bc34a; color:white;");
         else
             $("#device-"+data.deviceId).removeAttr("style");
     };
    //==========================================================
    //End stylechanger==========================================
    //==========================================================

});