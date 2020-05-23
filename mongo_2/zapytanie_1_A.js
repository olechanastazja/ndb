db.people.find().forEach( function (x) {
    x.height = parseFloat(x.height);
    x.weight = parseFloat(x.weight);
    db.people.save(x);
});

printjson(db.people.aggregate(
    {"$group": {
        '_id': "$sex",
        'averageHeight':  { $avg: "$height" },
        'averageWeight':  { $avg: "$weight" }
    }
    }
    ).toArray()
)