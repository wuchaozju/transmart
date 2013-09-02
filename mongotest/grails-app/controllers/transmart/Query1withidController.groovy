package transmart

class Query1withidController {
	def scaffold = Query1withid
	def b=Query1withid.get(2)
	def c = Query1withid.collection.find(patient_id:68)

	def test()
	{
		render c.size()
	}
}
