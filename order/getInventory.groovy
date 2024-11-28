package contracts.rest

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url ('/inventories/search/findByGetInventory/1')
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 200
        body(
        )
        bodyMatchers {
        }
        headers {
            contentType(applicationJson())
        }
    }
}
