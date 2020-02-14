## Estimate API Server

## API Spec

### Product
#### Product list API 
Request information

```http request
GET /api/product
```

Response information

```json
{
    "code": 200,
    "message": "OK",
    "data": [
        {
            "id": 1,
            "name": "제품 3",
            "rate": "안되겠지?"
        },
        {
            "id": 2,
            "name": "제품 2",
            "rate": "대용량 3L"
        },
        {
            "id": 3,
            "name": "제품 3",
            "rate": "안되겠지?"
        },
        {
            "id": 4,
            "name": "제품 4",
            "rate": "대용량 10L"
        }
    ],
    "success": true
}
```

#### Create Product API 
Request information

```http request
POST /api/product

{
	"name": "제품에 대한 제목",
	"rate": "대용량 1L"
}
```

Response information

```json
{
    "code": 200,
    "message": "OK",
    "data": {
        "id": 5,
        "name": "제품에 대한 제목",
        "rate": "대용량 1L"
    },
    "success": true
}
```

#### Delete Product API 
Request information

```http request
DELETE /api/product/{id}
```

Response information

```json
{
    "code": 200,
    "message": "OK",
    "data": null,
    "success": true
}
```

#### Update Product API 
Request information

```http request
POST /api/product/{id}

{
	"name": "수정될 제품",
	"rate": "초대용량 100L"
}
```

Response information

```json
{
    "code": 200,
    "message": "OK",
    "data": {
        "id": 3,
        "name": "수정될 제품",
        "rate": "초대용량 100L"
    },
    "success": true
}
```

