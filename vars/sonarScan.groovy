def call(String SONAR_SERVER, String SCANNER_HOME) {
    withSonarQubeEnv(SONAR_SERVER) {
        sh "${SCANNER_HOME}/bin/sonar-scanner -Dsonar.projectName=Youtube -Dsonar.projectKey=Youtube -Dsonar.sources=src"
    }
}