def call(String branch,String repoURL,String credentialsId){

checkout scmGit(branches: [[name: branch]], extensions: [], userRemoteConfigs: [[url: repoURL,credentialsId:credentialsId]])

}