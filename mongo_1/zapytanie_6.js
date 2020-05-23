printjson(db.people.insert({
    "sex" : "Female",
    "first_name" : "Agnieszka",
    "last_name" : "Olech",
    "job" : "Python Developer",
    "email" : "s21808@pjwstk.edu.pl",
    "location" : {
        "city" : "Warsaw",
        "address" : {
            "streetname" : "Topiel",
            "streetnumber" : "6"
         }
    },
    "description" : "vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum mauris",
    "height" : "163.00",
    "weight" : "58.00",
    "birth_date" : "1995-07-09T04:55:03Z",
    "nationality" : "Poland",
    "credit" : [
        {
        "type" : "visa",
        "number" : "6759888939100098699",
        "currency" : "PLN",
        "balance" : "10000000000.06"
        }
    ]
}
))