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
| GET      | `/products/getAllExpiredProducts` | Son kullanma tarihi geçmemiş ürünleri getirir. |
| POST      | `/products/add` | Yeni ürün ekler | |



### COMMENT-SERVICE

```
 path : localhost:8084/api/comments/**
```
getByUserIdWithDate/{userId}/{startDate}/{endDate}
| Http Method | Erişim Noktası     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| GET      | `/comments/getAll` | Veritabanındaki bütün ürünleri getirir. |
| GET      | `/comments/getByProductId/{productId}` | ProductId 'ye ait yorumları getirir. |
| GET      | `/comments/getByUserId/{userId}` | UserId' ye ait yorumları getirir. |
| GET      | `/comments/getByUserIdWithDate/{userId}/{startDate}/{endDate}` | UserId'ye ait belirli tarih aralığındaki yorumları getirir. |
| POST      | `/comments/add` | Yeni yorum ekler | |
