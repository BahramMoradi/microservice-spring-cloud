helm uninstall cassandra-db -n ns-cassandra-db
kubectl delete pvc --namespace ns-cassandra-db --all
kubectl delete namespace ns-cassandra-db
