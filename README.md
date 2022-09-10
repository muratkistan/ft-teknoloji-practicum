# ABOUT PROJECT

### USER-SERVICE

```
 url : localhost:8084/api/users/**
```

| Http Method | Erişim Noktası     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| GET      | `/users/getAll` | Veritabanındaki bütün kullanıcıları getirir. |
| POST      | `/users/add` | Yeni kullanıcı ekler | |


### PRODUCT-SERVICE

```
 url : localhost:8084/api/products/**
```

| Http Method | Erişim Noktası     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| GET      | `/products/getAll` | Veritabanındaki bütün ürünleri getirir. |
| GET      | `/products/getAllExpiredProducts` | Son kullanma tarihi geçmiş ürünleri getirir. |
| GET      | `/products/getAllNotExpiredProducts` | Son kullanma tarihi geçmemiş ya da tarih girilmemiş ürünleri getirir. |
| POST      | `/products/add` | Yeni ürün ekler | |



### PRODUCT-COMMENT-SERVICE

```
 url : localhost:8084/api/comments/**
```

| Http Method | Erişim Noktası     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| GET      | `/comments/getAllComments` | Veritabanındaki bütün yorumlari getirir. |
| GET      | `/comments/getCommentByProductId/{productId}` | ProductId 'ye ait yorumları getirir. |
| GET      | `/comments/getCommentByUserId/{userId}` | UserId' ye ait yorumları getirir. |
| GET      | `/comments/getCommentByUserIdWithDate/{userId}` | UserId'ye ait belirli tarih aralığındaki yorumları getirir. |
| GET      | `/comments/getCommentByProductIdWithDate/{productId}` | ProductId'ye ait belirli tarih aralığındaki yorumları getirir. |
| POST      | `/comments/add` | Yeni yorum ekler | |


## Sample Product

![ProSample](https://user-images.githubusercontent.com/67208557/189484247-d187b872-1372-4d13-877d-fa869f872146.PNG)


## Sample Comment

![comsample](https://user-images.githubusercontent.com/67208557/189484260-a7e8a907-6a09-438b-ad73-22b089ea0486.PNG)



## Swagger Documentation

![swaggerDoc](https://user-images.githubusercontent.com/67208557/189482680-291dda2f-3cd2-4b6c-8730-560fbcba3819.PNG)


