db.people.find().forEach( function (x) {
    x.weight = parseFloat(x.weight);
    db.people.save(x);
});

printjson(db.people.find({'weight':{"$gte":68,"$lt":71.5}}).toArray())