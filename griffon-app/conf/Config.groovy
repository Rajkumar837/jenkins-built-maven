application {
    title = 'app'
    startupGroups = ['app']
    autoShutdown = true
}
mvcGroups {
    // MVC Group for "app"
    'app' {
        model      = 'Batch1.AppModel'
        view       = 'Batch1.AppView'
        controller = 'Batch1.AppController'
    }
}