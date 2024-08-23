def call(String branch,String repoURL){

checkout scmGit(branches: [[name: branch]], extensions: [], userRemoteConfigs: [[url: repoURL]])

}