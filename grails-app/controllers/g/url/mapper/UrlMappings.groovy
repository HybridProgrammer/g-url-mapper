package g.url.mapper

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index2")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
