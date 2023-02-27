

aws s3api list-buckets

aws s3 ls s3://test-external-raw/

aws s3 ls s3://test-external-raw/ --recursive


aws s3api list-buckets --query "Buckets[].Name"


hdfs dfs -ls /


hadoop distcp -D dfs.replication=2 -update s3://test-external-raw/london_crime_by_lsoa.csv /user/raw
hadoop distcp -D dfs.blocksize=268435456 -update s3://test-external-raw/london_crime_by_lsoa.csv /user/raw


hdfs fsck /user/raw/london_crime_by_lsoa.csv -locations -blocks -files





s3://test-external-raw/london_crime_by_lsoa.csv