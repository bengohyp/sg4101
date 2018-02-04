#initialize classpath
source /home/cabox/workspace/Workshop-3/init.sh

#compile source codes
source /home/cabox/workspace/Workshop-3/compile.sh

#navigate to test directory
cd /home/cabox/workspace/Workshop-3/test

echo [Working] Compiling unit test codes...
javac -d ../bin/test sg/edu/nus/iss/club/MemberTest.java sg/edu/nus/iss/club/PersonTest.java sg/edu/nus/iss/club/FacilityTest.java sg/edu/nus/iss/club/ClubTest.java
echo [Done] Unit test code compilation complete!