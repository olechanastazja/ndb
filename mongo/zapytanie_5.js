printjson(db.people.aggregate(
      {
         "$project":
           {
             "_id" : 0,
             "first_name": 1,
             "last_name": 1,
             "city": {
               $cond: {
               if: { $lt: ["$birth_date","2000-01-01T00:00:00Z"] },
               then: "$$REMOVE",
               else: "$location.city"
            }
            }
           }
      },
).toArray())
