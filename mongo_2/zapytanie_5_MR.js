var mapFunction = function() {
    for (var idx = 0; idx < this.credit.length; idx++) {
       var key = this.credit[idx].currency;
       var value = this.credit[idx].balance;
       emit(key, value);
    };
};

var reduceFunction = function(key, values) {
   return Array.sum(values)
};


printjson(db.people.mapReduce(
   mapFunction,
   reduceFunction,
   {
     out: "sumPoland",
     query: {sex: "Female", nationality: "Poland"}
   }
)
)

printjson(db.sumPoland.find().toArray())
