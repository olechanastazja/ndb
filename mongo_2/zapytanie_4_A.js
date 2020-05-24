printjson(db.people.aggregate(
    {"$group": {
        '_id': "$nationality",
        'minBMI':  { $min: {$multiply: [10000, {$divide: ["$weight", {$multiply:["$height", '$height']} ] }]}},
        'maxBMI':  { $max: {$multiply: [10000, {$divide: ["$weight", {$multiply:["$height", '$height']} ] }]}},
        'avBMI':  { $avg:  {$multiply: [10000, {$divide: ["$weight", {$multiply:["$height", '$height']} ] }]}}
    }
    }
    ).toArray()
)