call def(){
    withSonarQubeEnv('sonarqube') {
                sh "${env.SCANNER_HOME}/bin/sonar-scanner -Dsonar.projectName=Youtube -Dsonar.projectKey=Youtube -Dsonar.sources=src"
            }
}