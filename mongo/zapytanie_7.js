db.people.find().forEach( function (x) {
    x.height = parseFloat(x.height);
    db.people.save(x);
});

printjson(db.people.remove({"height":{"$gt":190}}))