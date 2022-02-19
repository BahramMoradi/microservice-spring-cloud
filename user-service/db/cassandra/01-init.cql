 CREATE KEYSPACE IF NOT EXISTS userdb
      WITH REPLICATION = {
        'class': 'SimpleStrategy',
        'replication_factor' : 1
      };