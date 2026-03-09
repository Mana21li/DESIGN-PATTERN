package com.manali.designpatterns.solidPrinciples.dependencyInversionPrinciple;

public class DIP {
    public static void main(String[] args) {
        //DIP violated
        MongoDB mongo = new MongoDB();
        MySQL mysql = new MySQL();

        mongo.save();
        mysql.save();

        //DIP Followed
        DBPersistence mySQLPersistence = new MySQLPersistence();
        mySQLPersistence.save();
        DBPersistence mongoDBPersistence = new MongoDBPersistence();
        mongoDBPersistence.save();
    }
}

class MongoDB {
    public void save() {
        System.out.println("MongoDB save");
    }
}

class MySQL {
    public void save() {
        System.out.println("MySQL save");
    }
}

interface DBPersistence {
    public void save();
}

class MySQLPersistence implements DBPersistence {
    public void save() {
        System.out.println("MySQLPersistence save");
    }
}

class MongoDBPersistence implements DBPersistence {
    public void save() {
        System.out.println("MongoDBPersistence save");
    }
}
