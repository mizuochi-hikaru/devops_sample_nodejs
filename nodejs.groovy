job('NodeJS Job') {
    scm {
        git('https://github.com/mizuochi-hikaru/devops_sample_nodejs.git') {  node ->
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@example.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('NodeJS 13.7.0')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
