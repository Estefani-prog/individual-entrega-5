import React from "react";
import { Card, Button } from 'react-bootstrap'
import './Card.css'

export default props =>
  <Card style={{ width: '18rem' }}>
    <Card.Img variant="top" src={props.foto} />
    <Card.Body>
      <Card.Title>{props.titulo}</Card.Title>
      <Card.Text>
        {props.text}
      </Card.Text>
      <Button variant="primary">Saiba mais</Button>
    </Card.Body>
  </Card>


