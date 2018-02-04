#initialize classpath
source /home/cabox/workspace/Workshop-3/init.sh

#compile source and test codes
source /home/cabox/workspace/Workshop-3/compileTest.sh

#navigate to working test directory
cd /home/cabox/workspace/Workshop-3/bin/test

java org.junit.runner.JUnitCore sg.edu.nus.iss.club.MemberTest sg.edu.nus.iss.club.PersonTest sg.edu.nus.iss.club.FacilityTest sg.edu.nus.iss.club.ClubTest