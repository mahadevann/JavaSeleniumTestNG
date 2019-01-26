pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    sh 'pwd
                        cd
                        pwd
                    '

                    step([$class: 'Publisher', reportFilenamePattern: '/var/jenkins_home/workspace/JavaSel/target/surefire-report/testng-results.xml'])
                }
            }
        }
    }
}
