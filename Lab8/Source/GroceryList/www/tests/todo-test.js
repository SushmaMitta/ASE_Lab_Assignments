describe('GroceryController',function(){
    var scope;
    
    beforeEach(module('grocery-app'));
    beforeEach(inject(function($rootScope, $controller){
        scope = $rootScope.$new();
        $controller('GroceryController',{$scope: scope});
    }));
    
    it("Checks grocery list", function(){
        var size = scope.groceries.length;
        scope.onItemDelete("Apples");
        expect(scope.groceries.length).toEqual(size-1);
    });
});