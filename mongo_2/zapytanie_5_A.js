printjson(db.people.aggregate(
    {$match: {sex: "Female", nationality: "Poland" }},
    {$unwind: "$credit"},
    {$group: {
        '_id': "$credit.currency",
        'sumAll':  { $sum: "$credit.balance" },
    }
    }
    ).toArray()
)