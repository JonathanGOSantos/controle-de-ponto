`GET /entradas/{codigo}?dataInicio=yyyy-MM-dd&dataFim=yyyy-MM-dd`

`POST /entradas/{codigo}`
```json
{
  "codigo": 0,
  "horario": "yyyy-MM-dd HH:mm:ss"
}
```

`GET /usuarios/:codigo/saidas?dataInicio=yyyy-MM-dd&dataFim=yyyy-MM-dd`

`POST /usuarios/:codigo/saidas`
```json
{
  "codigo": 0,
  "horario": "yyyy-MM-dd HH:mm:ss"
}
```