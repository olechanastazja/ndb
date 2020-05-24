db.people.find().forEach( function (x) {
    x.credit.forEach(function(x) {
        x.balance = parseFloat(x.balance);
    })
    db.people.save(x);
});

printjson(db.people.aggregate(
    {$unwind: "$credit" },
    {"$group": {
        '_id': "$credit.currency",
        'sumAll':  { $sum: "$credit.balance" },
    }
    }
    ).toArray()
)