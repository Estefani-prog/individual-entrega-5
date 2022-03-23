import React from "react";
import { Card } from 'react-bootstrap'
import './Card.css'

export default props =>
  <Card style={{ width: '25rem' }}>
    <Card.Img variant="top" src={props.foto} />
    <Card.Body>
      <Card.Title>{props.titulo}</Card.Title>
      <Card.Text>
        {props.text}
      </Card.Text>
    </Card.Body>
    <strong>{props.valor}</strong>
  </Card>
