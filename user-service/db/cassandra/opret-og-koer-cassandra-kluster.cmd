kubectl apply -f namespace.yaml
kubectl apply -f configmap.yaml
helm install cassandra-db -n ns-cassandra-db -f values.yaml bitnami/cassandra