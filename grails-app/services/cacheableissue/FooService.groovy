package cacheableissue

import grails.plugin.cache.Cacheable

class FooService {
    @Cacheable("fooService")
    def calculateSomething() {
        return "foo"
    }
}
