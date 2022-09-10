# PROJE HAKKINDA

### USER-SERVICE

```
 path : localhost:8084/api/users/**
```

| Http Method | Erişim Noktası     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| GET      | `/users/getAll` | Veritabanındaki bütün kullanıcıları getirir. |
| POST      | `/users/add` | Yeni kullanici ekler | |


### PRODUCT-SERVICE

```
 path : localhost:8084/api/products/**
```

| Http Method | Erişim Noktası     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| GET      | `/products/getAll` | Veritabanındaki bütün ürünleri getirir. |
| GET      | `/products/getAllExpiredProducts` | Son kullanma tarihi geçmiş ürünleri getirir. |
| GET      | `/products/getAllNotExpiredProducts` | Son kullanma tarihi geçmemiş ya da tarih girilmemiş ürünleri getirir. |
| POST      | `/products/add` | Yeni ürün ekler | |



### PRODUCT-COMMENT-SERVICE

```
 path : localhost:8084/api/comments/**
```

| Http Method | Erişim Noktası     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| GET      | `/comments/getAllComments` | Veritabanındaki bütün yorumlari getirir. |
| GET      | `/comments/getCommentByProductId/{productId}` | ProductId 'ye ait yorumları getirir. |
| GET      | `/comments/getCommentByUserId/{userId}` | UserId' ye ait yorumları getirir. |
| GET      | `/comments/getCommentByProductIdWithDate/{productId}` | UserId'ye ait belirli tarih aralığındaki yorumları getirir. |
| GET      | `/comments/getCommentByProductIdWithDate/{productId}` | ProductId'ye ait belirli tarih aralığındaki yorumları getirir. |
| POST      | `/comments/add` | Yeni yorum ekler | |


## Swagger Documentation
![swaggerDoc](https://user-images.githubusercontent.com/67208557/189482680-291dda2f-3cd2-4b6c-8730-560fbcba3819.PNG)


