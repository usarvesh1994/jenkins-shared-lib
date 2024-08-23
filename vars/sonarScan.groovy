call def(String SCANNER_HOME){
    withSonarQubeEnv('sonarqube') {
                sh "${SCANNER_HOME}/bin/sonar-scanner -Dsonar.projectName=Youtube -Dsonar.projectKey=Youtube -Dsonar.sources=src"
            }
}