#!groovy

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'echo "Hello World"'
                sh  '''
                        sbt test
                    '''
            }
        }
    }

    post {

        always {

            echo 'Job done!'

        }

    }
}
