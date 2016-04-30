package main.java;

import java.util.ArrayList;
import java.util.HashMap;

import processing.core.PApplet;

public class Network extends Component implements DetectMouse{
	
	private float radius;
	private ArrayList<Node> nodes;

	//constructor
	public Network(MainApplet parent, float x, float y, float radius){
		super(parent, "Network", x, y);
		this.radius = radius;
		nodes = new ArrayList<Node>();
	}

	//display nodes and links
	@Override
	public void display(){
	}

	//detect mouse hovering
	@Override
	public boolean mouseOver() {
		return false;
	}
	
	//check if the node is in the list
	public boolean contain(Node node){
		return false;
	}
	
	//update coordinate of nodes
	public void update(){
	}
	
	//add a node
	public void addNode(Node node){
	}
	
	//delete a node
	public void delNode(Node node){
	}
	
	//delete all nodes
	public void clearAll(){
	}
	
	//add all nodes from list
	public void addALL(ArrayList<Node> nodes) {
	}
}
